(ns pinterest-rest-api.specs.brand-accounts-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.image-base64 :refer :all]
            )
  (:import (java.io File)))


(def brand-accounts-create-request-data
  {
   (ds/req :name) string?
   (ds/req :username) string?
   (ds/req :country) country-spec
   (ds/opt :about) string?
   (ds/opt :website) string?
   (ds/opt :profile_image) image-base64-spec
   })

(def brand-accounts-create-request-spec
  (ds/spec
    {:name ::brand-accounts-create-request
     :spec brand-accounts-create-request-data}))
