(ns pinterest-rest-api.specs.business-member-assets-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.asset-id-with-permissions :refer :all]
            [pinterest-rest-api.specs.asset-id-with-permissions :refer :all]
            )
  (:import (java.io File)))


(def business-member-assets-summary-data
  {
   (ds/opt :ad_accounts) (s/coll-of asset-id-with-permissions-spec)
   (ds/opt :profiles) (s/coll-of asset-id-with-permissions-spec)
   })

(def business-member-assets-summary-spec
  (ds/spec
    {:name ::business-member-assets-summary
     :spec business-member-assets-summary-data}))
