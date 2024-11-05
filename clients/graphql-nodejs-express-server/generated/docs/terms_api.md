# terms_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TermsRelatedList**](terms_api.md#TermsRelatedList) | **GET** /terms/related | List related terms
[**TermsSuggestedList**](terms_api.md#TermsSuggestedList) | **GET** /terms/suggested | List suggested terms


<a name="TermsRelatedList"></a>
# **TermsRelatedList**
> RelatedTerms TermsRelatedList(terms)

List related terms

Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.
<a name="TermsSuggestedList"></a>
# **TermsSuggestedList**
> String! TermsSuggestedList(term, limit)

List suggested terms

Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.
