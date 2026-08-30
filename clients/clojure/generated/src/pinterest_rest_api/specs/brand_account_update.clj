(ns pinterest-rest-api.specs.brand-account-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.brand-account-profile-image-update :refer :all]
            )
  (:import (java.io File)))


(def brand-account-update-data
  {
   (ds/opt :about) string?
   (ds/opt :country) country-spec
   (ds/opt :name) string?
   (ds/opt :profile_image) brand-account-profile-image-update-spec
   (ds/opt :username) string?
   (ds/opt :website) string?
   })

(def brand-account-update-spec
  (ds/spec
    {:name ::brand-account-update
     :spec brand-account-update-data}))
