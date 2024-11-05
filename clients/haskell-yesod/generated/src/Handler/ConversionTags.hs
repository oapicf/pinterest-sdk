{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.ConversionTags where

import           Import


-- | Create conversion tag
--
-- Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/#enhanced-match\&quot;&gt;Enhanced match&lt;/a&gt;
-- operationId: conversionTags/create
postAdAccountsByTextConversionTagsR :: Text -- ^ Unique identifier of an ad account.
                                    -> Handler Value
postAdAccountsByTextConversionTagsR adAccountId = notImplemented

-- | Get conversion tag
--
-- Get information about an existing conversion tag.
-- operationId: conversionTags/get
getAdAccountsByTextConversionTagsByTextR :: Text -- ^ Unique identifier of an ad account.
                                         -> Text -- ^ Id of the conversion tag.
                                         -> Handler Value
getAdAccountsByTextConversionTagsByTextR adAccountId conversionTagId = notImplemented

-- | Get conversion tags
--
-- List conversion tags associated with an ad account.
-- operationId: conversionTags/list
getAdAccountsByTextConversionTagsR :: Text -- ^ Unique identifier of an ad account.
                                   -> Handler Value
getAdAccountsByTextConversionTagsR adAccountId = notImplemented

-- | Get Ocpm eligible conversion tags
--
-- Get Ocpm eligible conversion tag events for an ad account.
-- operationId: ocpmEligibleConversionTags/get
getAdAccountsByTextConversionTagsOcpmEligibleR :: Text -- ^ Unique identifier of an ad account.
                                               -> Handler Value
getAdAccountsByTextConversionTagsOcpmEligibleR adAccountId = notImplemented

-- | Get page visit conversion tags
--
-- Get all page visit conversion tag events for an ad account.
-- operationId: pageVisitConversionTags/get
getAdAccountsByTextConversionTagsPageVisitR :: Text -- ^ Unique identifier of an ad account.
                                            -> Handler Value
getAdAccountsByTextConversionTagsPageVisitR adAccountId = notImplemented
