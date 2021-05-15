def main():
  pages = {}
  links = {}

  with open('data/pages_small.txt') as f:
    for data in f.read().splitlines():
      page = data.split('\t')
      # page[0]: id, page[1]: title
      pages[page[0]] = page[1]

  with open('data/links_small.txt') as f:
    for data in f.read().splitlines():
      link = data.split('\t')
      # link[0]: id (from), links[1]: id (to)
      if link[0] in links:
        links[link[0]].add(link[1])
      else:
        links[link[0]] = {link[1]}

  for k, v in pages.items():
    if v == 'Google':
      print('Google', k)


if __name__ == '__main__':
  main()
