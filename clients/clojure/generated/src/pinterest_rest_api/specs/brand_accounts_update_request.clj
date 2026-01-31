(ns pinterest-rest-api.specs.brand-accounts-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.image-base64 :refer :all]
            )
  (:import (java.io File)))


(def brand-accounts-update-request-data
  {
   (ds/opt :name) string?
   (ds/opt :username) string?
   (ds/opt :country) country-spec
   (ds/opt :about) string?
   (ds/opt :website) string?
   (ds/opt :profile_image) image-base64-spec
   })

(def brand-accounts-update-request-spec
  (ds/spec
    {:name ::brand-accounts-update-request
     :spec brand-accounts-update-request-data}))
