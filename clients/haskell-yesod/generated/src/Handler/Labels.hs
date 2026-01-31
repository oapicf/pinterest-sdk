{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Labels where

import           Import


-- | Create labels
--
-- &lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;
-- operationId: labels/create
postAdAccountsByTextLabelsR :: Text -- ^ Unique identifier of an ad account.
                            -> Handler Value
postAdAccountsByTextLabelsR adAccountId = notImplemented

-- | List labels
--
-- &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;
-- operationId: labels/list
getAdAccountsByTextLabelsR :: Text -- ^ Unique identifier of an ad account.
                           -> Handler Value
getAdAccountsByTextLabelsR adAccountId = notImplemented

-- | Update labels
--
-- &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;
-- operationId: labels/update
patchAdAccountsByTextLabelsR :: Text -- ^ Unique identifier of an ad account.
                             -> Handler Value
patchAdAccountsByTextLabelsR adAccountId = notImplemented
