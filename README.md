# Google STEP Class 4 Homework

## 課題内容

### 1. Wikipediaのグラフを使ってなにか面白いことをしてみよう

- 必須："Google"から"渋谷"までを（最短で）たどる方法を探す
- その他なんでも
    - 例：孤立している隠されたページを探す
    - 例：ページランクの高いものを探す

### 2. 他の人の書いたコードを自分の環境で実行してレビューする

- スライド参照

## 準備

[wikipedia_data.zip](https://drive.google.com/file/d/1zqtjSb-ZoR4rzVUWZrjNSES5GKJhYmmH/view?usp=sharing) をダウンロードして解凍し、以下のようなディレクトリ構成にしてください。

```
step-wikipedia
├── data
│   ├── graph_small.png
│   ├── links_small.txt
│   ├── links.txt
│   ├── pages_small.txt
│   └── pages.txt
├── .gitignore
├── README.md
├── wikipedia_sample.cc
└── wikipedia_sample.py
```

## グラフデータ

`data/` に含まれるファイルで、実際に使うものは以下の2つです。

- pages.txt：各ページのidとタイトルのリスト
- links.txt：各リンクのリンク元とリンク先のリスト

以下の3つはテスト用の小さなグラフを表すデータです。

- pages_small.txt
- links_small.txt
- graph_small.png

詳細はスライドを参照してください。

数年前のデータを使っているため、最新の Wikipedia とは異なるリンク構造になっていることに注意してください。

## サンプルコード

データの読み込みを行うサンプルコードを用意しました。サンプルでしかないため、改善できるところもたくさんあるはずです。何か気づいたら自分で書き換えてみてください。

各プログラムを実行すると、Google をタイトルとするページの id が表示されます。

### 実行環境

以下の環境で動作確認をしました。これ以外では動かないことがあるかもしれません。

* C++: g++ 10.2.1
* Python: 3.9.2

### 実行方法

#### C++

```
g++ wikipedia_sample.cc && ./a.out
```

#### Python

```
python3 wikipedia_sample.py
```
