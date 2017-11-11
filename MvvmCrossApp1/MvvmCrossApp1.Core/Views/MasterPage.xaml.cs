using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MvvmCross.Forms.Views;
using MvvmCross.Forms.Views.Attributes;
using MvvmCrossApp1.Core.ViewModels;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace MvvmCrossApp1.Core.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    [MvxMasterDetailPagePresentation(MasterDetailPosition.Master, WrapInNavigationPage = false)]
    public partial class MasterPage : MvxContentPage<MasterViewModel>
    {
        public MasterPage()
        {
            InitializeComponent();
            
        }
    }
}