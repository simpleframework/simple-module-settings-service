package net.simpleframework.module.settings;

import net.simpleframework.ctx.IModuleContextAware;
import net.simpleframework.ctx.ModuleContextFactory;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public interface ISettingsContextAware extends IModuleContextAware {

	static ISettingsContext context = ModuleContextFactory.get(ISettingsContext.class);
}
