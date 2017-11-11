using MvvmCross.Platform.IoC;
using MvvmCrossApp1.Core.ViewModels;

namespace MvvmCrossApp1.Core
{
    public class App : MvvmCross.Core.ViewModels.MvxApplication
    {
        public override void Initialize()
        {
            CreatableTypes()
                .EndingWith("Service")
                .AsInterfaces()
                .RegisterAsLazySingleton();

            RegisterNavigationServiceAppStart<MasterViewModel>();
        }
    }
}
