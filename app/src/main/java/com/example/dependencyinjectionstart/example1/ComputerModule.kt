package com.example.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor = Monitor()

    @Provides
    fun provideKeyboard(): Keyboard = Keyboard()

    @Provides
    fun provideMemory(): Memory = Memory()

    @Provides
    fun provideMouse(): Mouse = Mouse()

    @Provides
    fun providesProcessor(): Processor = Processor()

    @Provides
    fun provideStorage(): Storage = Storage()

    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ): ComputerTower {
        return ComputerTower(storage, memory, processor)
    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse,
    ): Computer {
        return Computer(monitor, computerTower, keyboard, mouse)
    }

}