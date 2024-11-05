(ns pinterest-rest-api.specs.ad-accounts-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-account :refer :all]
            )
  (:import (java.io File)))


(def ad-accounts-list-200-response-data
  {
   (ds/req :items) (s/coll-of ad-account-spec)
   (ds/opt :bookmark) string?
   })

(def ad-accounts-list-200-response-spec
  (ds/spec
    {:name ::ad-accounts-list-200-response
     :spec ad-accounts-list-200-response-data}))
