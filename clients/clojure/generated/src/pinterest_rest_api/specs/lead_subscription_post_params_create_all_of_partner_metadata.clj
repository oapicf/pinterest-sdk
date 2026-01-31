(ns pinterest-rest-api.specs.lead-subscription-post-params-create-all-of-partner-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-subscription-post-params-create-all-of-partner-metadata-data
  {
   (ds/opt :subscriber_key) string?
   })

(def lead-subscription-post-params-create-all-of-partner-metadata-spec
  (ds/spec
    {:name ::lead-subscription-post-params-create-all-of-partner-metadata
     :spec lead-subscription-post-params-create-all-of-partner-metadata-data}))
