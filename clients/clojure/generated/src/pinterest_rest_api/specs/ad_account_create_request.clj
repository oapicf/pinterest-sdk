(ns pinterest-rest-api.specs.ad-account-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            )
  (:import (java.io File)))


(def ad-account-create-request-data
  {
   (ds/opt :country) country-spec
   (ds/opt :name) string?
   (ds/opt :owner_user_id) string?
   })

(def ad-account-create-request-spec
  (ds/spec
    {:name ::ad-account-create-request
     :spec ad-account-create-request-data}))
