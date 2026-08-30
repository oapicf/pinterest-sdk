(ns pinterest-rest-api.specs.update-partner-assets-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-type-response :refer :all]
            )
  (:import (java.io File)))


(def update-partner-assets-result-data
  {
   (ds/opt :asset_id) string?
   (ds/opt :asset_type) asset-type-response-spec
   (ds/opt :partner_id) string?
   (ds/opt :permissions) (s/coll-of string?)
   })

(def update-partner-assets-result-spec
  (ds/spec
    {:name ::update-partner-assets-result
     :spec update-partner-assets-result-data}))
