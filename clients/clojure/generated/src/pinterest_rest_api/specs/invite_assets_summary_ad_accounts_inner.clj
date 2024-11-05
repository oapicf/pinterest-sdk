(ns pinterest-rest-api.specs.invite-assets-summary-ad-accounts-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invite-assets-summary-ad-accounts-inner-data
  {
   (ds/opt :id) string?
   (ds/opt :permissions) (s/coll-of string?)
   })

(def invite-assets-summary-ad-accounts-inner-spec
  (ds/spec
    {:name ::invite-assets-summary-ad-accounts-inner
     :spec invite-assets-summary-ad-accounts-inner-data}))
