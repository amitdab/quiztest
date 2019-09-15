package com.example.fragtest.databinding;
import com.example.fragtest.R;
import com.example.fragtest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentGameBindingImpl extends FragmentGameBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.RR, 7);
        sViewsWithIds.put(R.id.playme, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener R1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of gameplay.answers[0]
            //         is androidx.databinding.ViewDataBinding.setTo(gameplay.answers, 0, callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(R1);
            // localize variables for thread safety
            // gameplay.answers
            java.util.List<java.lang.String> gameplayAnswers = null;
            // gameplay != null
            boolean gameplayJavaLangObjectNull = false;
            // gameplay.answers[0]
            java.lang.String gameplayAnswers0 = null;
            // gameplay
            com.example.fragtest.GameFragment gameplay = mGameplay;



            gameplayJavaLangObjectNull = (gameplay) != (null);
            if (gameplayJavaLangObjectNull) {


                gameplayAnswers = gameplay.getAnswers();



                androidx.databinding.ViewDataBinding.setTo(gameplayAnswers, 0, callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener R2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of gameplay.answers[1]
            //         is androidx.databinding.ViewDataBinding.setTo(gameplay.answers, 1, callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(R2);
            // localize variables for thread safety
            // gameplay.answers
            java.util.List<java.lang.String> gameplayAnswers = null;
            // gameplay != null
            boolean gameplayJavaLangObjectNull = false;
            // gameplay
            com.example.fragtest.GameFragment gameplay = mGameplay;
            // gameplay.answers[1]
            java.lang.String gameplayAnswers1 = null;



            gameplayJavaLangObjectNull = (gameplay) != (null);
            if (gameplayJavaLangObjectNull) {


                gameplayAnswers = gameplay.getAnswers();



                androidx.databinding.ViewDataBinding.setTo(gameplayAnswers, 1, callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener R3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of gameplay.answers[2]
            //         is androidx.databinding.ViewDataBinding.setTo(gameplay.answers, 2, callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(R3);
            // localize variables for thread safety
            // gameplay.answers
            java.util.List<java.lang.String> gameplayAnswers = null;
            // gameplay != null
            boolean gameplayJavaLangObjectNull = false;
            // gameplay
            com.example.fragtest.GameFragment gameplay = mGameplay;
            // gameplay.answers[2]
            java.lang.String gameplayAnswers2 = null;



            gameplayJavaLangObjectNull = (gameplay) != (null);
            if (gameplayJavaLangObjectNull) {


                gameplayAnswers = gameplay.getAnswers();



                androidx.databinding.ViewDataBinding.setTo(gameplayAnswers, 2, callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener R4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of gameplay.answers[3]
            //         is androidx.databinding.ViewDataBinding.setTo(gameplay.answers, 3, callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(R4);
            // localize variables for thread safety
            // gameplay.answers
            java.util.List<java.lang.String> gameplayAnswers = null;
            // gameplay != null
            boolean gameplayJavaLangObjectNull = false;
            // gameplay
            com.example.fragtest.GameFragment gameplay = mGameplay;
            // gameplay.answers[3]
            java.lang.String gameplayAnswers3 = null;



            gameplayJavaLangObjectNull = (gameplay) != (null);
            if (gameplayJavaLangObjectNull) {


                gameplayAnswers = gameplay.getAnswers();



                androidx.databinding.ViewDataBinding.setTo(gameplayAnswers, 3, callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener iAmAnswerandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of gameplay.answers[4]
            //         is androidx.databinding.ViewDataBinding.setTo(gameplay.answers, 4, callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(iAmAnswer);
            // localize variables for thread safety
            // gameplay.answers
            java.util.List<java.lang.String> gameplayAnswers = null;
            // gameplay != null
            boolean gameplayJavaLangObjectNull = false;
            // gameplay
            com.example.fragtest.GameFragment gameplay = mGameplay;
            // gameplay.answers[4]
            java.lang.String gameplayAnswers4 = null;



            gameplayJavaLangObjectNull = (gameplay) != (null);
            if (gameplayJavaLangObjectNull) {


                gameplayAnswers = gameplay.getAnswers();



                androidx.databinding.ViewDataBinding.setTo(gameplayAnswers, 4, callbackArg_0);
            }
        }
    };
    private androidx.databinding.InverseBindingListener textViewandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of gameplay.ques
            //         is gameplay.setQues((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(textView);
            // localize variables for thread safety
            // gameplay.ques
            java.lang.String gameplayQues = null;
            // gameplay != null
            boolean gameplayJavaLangObjectNull = false;
            // gameplay
            com.example.fragtest.GameFragment gameplay = mGameplay;



            gameplayJavaLangObjectNull = (gameplay) != (null);
            if (gameplayJavaLangObjectNull) {




                gameplay.setQues(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentGameBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentGameBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RadioButton) bindings[2]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.RadioGroup) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[1]
            );
        this.R1.setTag(null);
        this.R2.setTag(null);
        this.R3.setTag(null);
        this.R4.setTag(null);
        this.iAmAnswer.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.gameplay == variableId) {
            setGameplay((com.example.fragtest.GameFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGameplay(@Nullable com.example.fragtest.GameFragment Gameplay) {
        this.mGameplay = Gameplay;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.gameplay);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.util.List<java.lang.String> gameplayAnswers = null;
        com.example.fragtest.GameFragment gameplay = mGameplay;
        java.lang.String gameplayAnswers0 = null;
        java.lang.String gameplayAnswers2 = null;
        java.lang.String gameplayAnswers4 = null;
        java.lang.String gameplayQues = null;
        java.lang.String gameplayAnswers1 = null;
        java.lang.String gameplayAnswers3 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (gameplay != null) {
                    // read gameplay.answers
                    gameplayAnswers = gameplay.getAnswers();
                    // read gameplay.ques
                    gameplayQues = gameplay.getQues();
                }


                if (gameplayAnswers != null) {
                    // read gameplay.answers[0]
                    gameplayAnswers0 = getFromList(gameplayAnswers, 0);
                    // read gameplay.answers[2]
                    gameplayAnswers2 = getFromList(gameplayAnswers, 2);
                    // read gameplay.answers[4]
                    gameplayAnswers4 = getFromList(gameplayAnswers, 4);
                    // read gameplay.answers[1]
                    gameplayAnswers1 = getFromList(gameplayAnswers, 1);
                    // read gameplay.answers[3]
                    gameplayAnswers3 = getFromList(gameplayAnswers, 3);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.R1, gameplayAnswers0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.R2, gameplayAnswers1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.R3, gameplayAnswers2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.R4, gameplayAnswers3);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.iAmAnswer, gameplayAnswers4);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, gameplayQues);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.R1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, R1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.R2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, R2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.R3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, R3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.R4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, R4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.iAmAnswer, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, iAmAnswerandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.textView, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, textViewandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gameplay
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}