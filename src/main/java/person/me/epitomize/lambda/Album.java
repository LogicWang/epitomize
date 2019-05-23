package person.me.epitomize.lambda;

import lombok.Getter;
import lombok.Setter;

/**
 * 专辑，由若干曲目组成。
 */

@Getter
@Setter
public class Album {
    private String name;//专辑名(例如《左轮手枪》)。
    private String tracks;//专辑上所有曲目的列表。
    private String musicians;//参与创作本专辑的艺术家列表。

}
