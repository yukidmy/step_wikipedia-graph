#include <fstream>
#include <iostream>
#include <map>
#include <set>
#include <sstream>
#include <string>

int main() {
  std::map<std::string, std::string> pages;
  std::map<std::string, std::set<std::string>> links;

  {
    std::ifstream file("data/pages_small.txt");
    std::string data;
    while (std::getline(file, data)) {
      auto index = data.find('\t');
      auto id = data.substr(0, index);
      auto title = data.substr(index + 1, data.size() - id.size() - 1);
      pages[id] = title;
    }
  }

  {
    std::ifstream file("data/links_small.txt");
    std::string data;
    while (std::getline(file, data)) {
      auto index = data.find('\t');
      auto from = data.substr(0, index);
      auto to = data.substr(index + 1, data.size() - from.size() - 1);
      links[from].insert(to);
    }
  }

  for (const auto& page : pages) {
    if (page.second == "Google") {
      std::cout << page.second << " " << page.first << std::endl;
      break;
    }
  }

  return 0;
}
