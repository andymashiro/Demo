package codeC;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import protocol.Packet;
import protocol.PacketCodeC;

/**
 * @author DengWei
 * @date 2019/12/6 16:23
 */
public class PacketEncoder extends MessageToByteEncoder<Packet> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Packet packet, ByteBuf out) {
        PacketCodeC.INSTANCE.encode(out,packet);
    }
}
