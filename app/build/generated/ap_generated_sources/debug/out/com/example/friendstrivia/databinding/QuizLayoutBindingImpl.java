package com.example.friendstrivia.databinding;
import com.example.friendstrivia.R;
import com.example.friendstrivia.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class QuizLayoutBindingImpl extends QuizLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView3, 5);
        sViewsWithIds.put(R.id.questionRGP, 6);
        sViewsWithIds.put(R.id.submit, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public QuizLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private QuizLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.RadioGroup) bindings[6]
            , (android.widget.RadioButton) bindings[2]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.radioButton1.setTag(null);
        this.radioButton2.setTag(null);
        this.radioButton3.setTag(null);
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
        if (BR.quiz == variableId) {
            setQuiz((com.example.friendstrivia.QuizFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuiz(@Nullable com.example.friendstrivia.QuizFragment Quiz) {
        this.mQuiz = Quiz;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.quiz);
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
        com.example.friendstrivia.QuizFragment.Question quizCurrentQuestion = null;
        java.util.List<java.lang.String> quizAns = null;
        com.example.friendstrivia.QuizFragment quiz = mQuiz;
        java.lang.String quizCurrentQuestionText = null;
        java.lang.String quizAns2 = null;
        java.lang.String quizAns1 = null;
        java.lang.String quizAns0 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (quiz != null) {
                    // read quiz.currentQuestion
                    quizCurrentQuestion = quiz.getCurrentQuestion();
                    // read quiz.ans
                    quizAns = quiz.getAns();
                }


                if (quizCurrentQuestion != null) {
                    // read quiz.currentQuestion.text
                    quizCurrentQuestionText = quizCurrentQuestion.getText();
                }
                if (quizAns != null) {
                    // read quiz.ans[2]
                    quizAns2 = getFromList(quizAns, 2);
                    // read quiz.ans[1]
                    quizAns1 = getFromList(quizAns, 1);
                    // read quiz.ans[0]
                    quizAns0 = getFromList(quizAns, 0);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.radioButton1, quizAns0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.radioButton2, quizAns1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.radioButton3, quizAns2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, quizCurrentQuestionText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): quiz
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}