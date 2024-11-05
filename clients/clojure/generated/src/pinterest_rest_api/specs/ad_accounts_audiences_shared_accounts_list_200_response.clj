(ns pinterest-rest-api.specs.ad-accounts-audiences-shared-accounts-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.shared-audience-account :refer :all]
            )
  (:import (java.io File)))


(def ad-accounts-audiences-shared-accounts-list-200-response-data
  {
   (ds/req :items) (s/coll-of shared-audience-account-spec)
   (ds/opt :bookmark) string?
   })

(def ad-accounts-audiences-shared-accounts-list-200-response-spec
  (ds/spec
    {:name ::ad-accounts-audiences-shared-accounts-list-200-response
     :spec ad-accounts-audiences-shared-accounts-list-200-response-data}))
