(ns pinterest-rest-api.specs.business-member-assets-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-member-assets-summary-ad-accounts-inner :refer :all]
            [pinterest-rest-api.specs.business-member-assets-summary-profiles-inner :refer :all]
            )
  (:import (java.io File)))


(def business-member-assets-summary-data
  {
   (ds/opt :ad_accounts) (s/coll-of business-member-assets-summary-ad-accounts-inner-spec)
   (ds/opt :profiles) (s/coll-of business-member-assets-summary-profiles-inner-spec)
   })

(def business-member-assets-summary-spec
  (ds/spec
    {:name ::business-member-assets-summary
     :spec business-member-assets-summary-data}))
