(ns pinterest-rest-api.specs.invite-assets-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.invite-assets-summary-item :refer :all]
            [pinterest-rest-api.specs.invite-assets-summary-item :refer :all]
            )
  (:import (java.io File)))


(def invite-assets-summary-data
  {
   (ds/opt :ad_accounts) (s/coll-of invite-assets-summary-item-spec)
   (ds/opt :profiles) (s/coll-of invite-assets-summary-item-spec)
   })

(def invite-assets-summary-spec
  (ds/spec
    {:name ::invite-assets-summary
     :spec invite-assets-summary-data}))
