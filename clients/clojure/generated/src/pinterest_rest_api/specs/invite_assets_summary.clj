(ns pinterest-rest-api.specs.invite-assets-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.invite-assets-summary-ad-accounts-inner :refer :all]
            [pinterest-rest-api.specs.invite-assets-summary-profiles-inner :refer :all]
            )
  (:import (java.io File)))


(def invite-assets-summary-data
  {
   (ds/opt :ad_accounts) (s/coll-of invite-assets-summary-ad-accounts-inner-spec)
   (ds/opt :profiles) (s/coll-of invite-assets-summary-profiles-inner-spec)
   })

(def invite-assets-summary-spec
  (ds/spec
    {:name ::invite-assets-summary
     :spec invite-assets-summary-data}))
