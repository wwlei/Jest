package io.searchbox.indices.settings;

import io.searchbox.AbstractAction;
import io.searchbox.AbstractMultiTypeActionBuilder;


public class GetSettings extends AbstractAction {

	    private GetSettings(Builder builder) {
	        super(builder);
	        this.indexName = builder.index;
	        setURI(buildURI());
	    }

	    @Override
	    public String getRestMethodName() {
	        return "GET";
	    }

	    @Override
	    protected String buildURI() {
	        StringBuilder sb = new StringBuilder();
	        sb.append(super.buildURI()).append("/_settings");
	        return sb.toString();
	    }

	    public static class Builder extends AbstractMultiTypeActionBuilder<GetSettings, Builder> {

	    	private  String index;
	    	public Builder(String index)
	    	{
	    		this.index = index;
	    	}
	        @Override
	        public GetSettings build() {
	            return new GetSettings(this);
	        }
	    }

	
}
