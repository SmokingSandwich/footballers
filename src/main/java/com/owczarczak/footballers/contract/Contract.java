package com.owczarczak.footballers.contract;

import com.owczarczak.footballers.club.Club;
import com.owczarczak.footballers.footballer.Footballer;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Builder
@Table(name = "contract")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;

    @OneToOne
    @JoinColumn(name = "footballer_id")
    private Footballer footballer;

    private Instant contractStart;
    private Instant contractEnd;
    private int salary;
}
