(ns pinterest-rest-api.specs.ad-account-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.currency :refer :all]
            )
  (:import (java.io File)))


(def ad-account-create-data
  {
   (ds/opt :country) country-spec
   (ds/opt :currency) currency-spec
   (ds/opt :name) string?
   (ds/opt :owner_user_id) string?
   (ds/opt :time_zone) string?
   })

(def ad-account-create-spec
  (ds/spec
    {:name ::ad-account-create
     :spec ad-account-create-data}))
