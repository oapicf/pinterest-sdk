(ns pinterest-rest-api.specs.business-member-assets-summary-ad-accounts-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def business-member-assets-summary-ad-accounts-inner-data
  {
   (ds/opt :id) string?
   (ds/opt :permissions) (s/coll-of string?)
   })

(def business-member-assets-summary-ad-accounts-inner-spec
  (ds/spec
    {:name ::business-member-assets-summary-ad-accounts-inner
     :spec business-member-assets-summary-ad-accounts-inner-data}))
