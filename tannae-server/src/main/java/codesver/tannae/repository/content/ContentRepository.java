package codesver.tannae.repository.content;

import codesver.tannae.domain.Content;

import java.util.List;

public interface ContentRepository {

    public List<Content> findAll();

    public Integer register(Content content);
}
