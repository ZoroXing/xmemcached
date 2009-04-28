/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.rubyeye.xmemcached;

import com.google.code.yanf4j.util.Queue;
import java.util.concurrent.BlockingQueue;
import net.rubyeye.xmemcached.command.Command;
import net.rubyeye.xmemcached.monitor.OptimiezerMBean;

/**
 * xmemcached优化器，决定优化策略
 * 
 * @author dennis
 */
public interface Optimiezer extends OptimiezerMBean {
	@SuppressWarnings("unchecked")
	Command optimieze(final Command currentCommand, final Queue writeQueue,
			final BlockingQueue<Command> executingCmds, int sendBufferSize);
}
