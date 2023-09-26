package ru.netology.javaqa;

public class FilmManager {
    private FilmItem[] items = new FilmItem[0];
    private int limit;

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public FilmManager() {
        limit = 5;
    }

    public void add(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {
        return items;
    }

    public FilmItem[] findLast() {
        FilmItem[] all = findAll();

        int resultLength = limit < items.length ? limit : items.length;
        FilmItem[] result = new FilmItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;
    }

}
