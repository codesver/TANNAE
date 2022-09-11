package codesver.tannae.repository.history;

import codesver.tannae.domain.History;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HistorySpringDataJpaRepository extends JpaRepository<History, Integer> {

    Optional<History> findHistoryByUsn(int usn);
}