package protocol.request;

import lombok.Data;
import protocol.Packet;

import static protocol.command.Command.LOGIN_REQUEST;

/**
 * @author DengWei
 * @date 2019/12/6 15:53
 */
@Data
public class LoginRequestPacket extends Packet {

    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {

        return LOGIN_REQUEST;
    }
}
