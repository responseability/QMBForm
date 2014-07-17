package com.quemb.qmbform.view;

import com.quemb.qmbform.R;
import com.quemb.qmbform.descriptor.RowDescriptor;
import com.quemb.qmbform.descriptor.Value;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by tonimoeckel on 15.07.14.
 */
public class FormDetailTextFieldCell extends FormTitleFieldCell {

    private TextView mDetailTextView;

    public FormDetailTextFieldCell(Context context,
            RowDescriptor rowDescriptor) {
        super(context, rowDescriptor);
    }

    @Override
    protected void init() {

        super.init();
        mDetailTextView = (TextView)findViewById(R.id.detailTextView);

    }

    @Override
    protected int getResource() {
        return R.layout.detail_text_field_cell;
    }

    @Override
    protected void update() {

        super.update();

        Value<String> value = (Value<String>) getRowDescriptor().getValue();
        getDetailTextView().setText(value.getValue());

    }

    public TextView getDetailTextView() {
        return mDetailTextView;
    }
}