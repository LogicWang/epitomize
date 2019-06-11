package person.me.epitomize.lambda.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Stream;

/**
 * 专辑，由若干曲目组成。
 */

@Getter
@Setter
public class Album {
    private String name;//专辑名(例如《左轮手枪》)。
    private List<Track> tracks;//专辑上所有曲目的列表。
    private List<Artist> musicians;//参与创作本专辑的艺术家列表。
    private Artist mainMusician;

}