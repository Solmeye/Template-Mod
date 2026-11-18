package net.example.template.mixin;

import java.net.Proxy;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.mojang.datafixers.DataFixer;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.Services;
import net.minecraft.server.WorldStem;
import net.minecraft.server.level.progress.LevelLoadListener;
import net.minecraft.server.packs.repository.PackRepository;
import net.minecraft.world.level.storage.LevelStorageSource.LevelStorageAccess;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {

    @Inject(method = "<init>", at = @At("RETURN"))
    private void template$init(
        Thread serverThread,
        LevelStorageAccess storageSource,
        PackRepository packRepository,
        WorldStem worldStem,
        Proxy proxy,
        DataFixer fixerUpper,
        Services services,
        LevelLoadListener levelLoadListener,
        CallbackInfo callback
    ) {
    }
}
