(ns pinterest-rest-api.specs.brand-account-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.brand-account-profile-image :refer :all]
            )
  (:import (java.io File)))


(def brand-account-create-data
  {
   (ds/opt :about) string?
   (ds/req :country) country-spec
   (ds/req :name) string?
   (ds/opt :profile_image) brand-account-profile-image-spec
   (ds/req :username) string?
   (ds/opt :website) string?
   })

(def brand-account-create-spec
  (ds/spec
    {:name ::brand-account-create
     :spec brand-account-create-data}))
