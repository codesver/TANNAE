package codesver.tannae.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hsn;

    @Column(length = 50, nullable = false)
    private String origin;

    @Column(nullable = false)
    private Double originLatitude;

    @Column(nullable = false)
    private Double originLongitude;

    @Column(length = 50, nullable = false)
    private String destination;

    @Column(nullable = false)
    private Double destinationLatitude;

    @Column(nullable = false)
    private Double destinationLongitude;

    @Column(nullable = false)
    private Boolean share;

    @Column(length = 19, nullable = false)
    private String requestTime;

    @Column(length = 19)
    private String boardingTime;

    @Column(length = 19)
    private String arrivalTime;

    @Column(nullable = false)
    private Integer originalFare;

    @Column(nullable = false)
    private Integer originalDistance;

    @Column(nullable = false)
    private Integer originalDuration;

    @Column
    private Integer realFare;

    @Column
    private Integer realDistance;

    @Column
    private Integer realDuration;

    @Column(length = 1, columnDefinition = "TINYINT")
    private Boolean end;

    @Column
    private Integer usn;

    @Column
    private Integer vsn;

    public History(String origin, Double originLatitude, Double originLongitude, String destination, Double destinationLatitude, Double destinationLongitude, Boolean share, String requestTime, Integer originalFare, Integer originalDistance, Integer originalDuration, Boolean end, Integer usn, Integer vsn) {
        this.origin = origin;
        this.originLatitude = originLatitude;
        this.originLongitude = originLongitude;
        this.destination = destination;
        this.destinationLatitude = destinationLatitude;
        this.destinationLongitude = destinationLongitude;
        this.share = share;
        this.requestTime = requestTime;
        this.originalFare = originalFare;
        this.originalDistance = originalDistance;
        this.originalDuration = originalDuration;
        this.end = end;
        this.usn = usn;
        this.vsn = vsn;
    }
}
