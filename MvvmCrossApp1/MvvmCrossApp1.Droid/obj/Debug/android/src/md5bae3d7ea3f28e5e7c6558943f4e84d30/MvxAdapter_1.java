package md5bae3d7ea3f28e5e7c6558943f4e84d30;


public class MvxAdapter_1
	extends md5bae3d7ea3f28e5e7c6558943f4e84d30.MvxAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Binding.Droid.Views.MvxAdapter`1, MvvmCross.Binding.Droid, Version=5.4.2.0, Culture=neutral, PublicKeyToken=null", MvxAdapter_1.class, __md_methods);
	}


	public MvxAdapter_1 ()
	{
		super ();
		if (getClass () == MvxAdapter_1.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxAdapter`1, MvvmCross.Binding.Droid, Version=5.4.2.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public MvxAdapter_1 (android.content.Context p0)
	{
		super ();
		if (getClass () == MvxAdapter_1.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxAdapter`1, MvvmCross.Binding.Droid, Version=5.4.2.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
