package codesver.tannae.domain;


import org.json.JSONArray;

import java.util.Optional;

public class DRO<T> {
    private int flag;
    private final Optional<T> option;
    private JSONArray guides;

    public DRO() {
        option = Optional.empty();
    }

    public DRO(int flag) {
        this.flag = flag;
        option = Optional.empty();
    }

    public DRO(int flag, T t) {
        this.flag = flag;
        option = Optional.of(t);
    }

    public DRO(int flag, T t, JSONArray guides) {
        this.flag = flag;
        option = Optional.of(t);
        this.guides = guides;
    }

    public DRO<T> setFlag(int flag) {
        this.flag = flag;
        return this;
    }

    public int getFlag() {
        return flag;
    }

    public T get() {
        return option.orElse(null);
    }

    public JSONArray getGuides() {
        return guides;
    }

    public boolean isPresent() {
        return option.isPresent();
    }
}
