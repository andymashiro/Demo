package protocol.response;

import lombok.Data;
import protocol.Packet;

import static protocol.command.Command.LOGIN_RESPONSE;

/**
 * @author DengWei
 * @date 2019/12/6 16:04
 */

@Data
public class LoginResponsePacket extends Packet {
    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}