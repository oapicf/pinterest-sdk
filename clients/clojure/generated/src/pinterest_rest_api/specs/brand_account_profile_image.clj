(ns pinterest-rest-api.specs.brand-account-profile-image
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def brand-account-profile-image-data
  {
   (ds/req :content_type) string?
   (ds/req :data) string?
   })

(def brand-account-profile-image-spec
  (ds/spec
    {:name ::brand-account-profile-image
     :spec brand-account-profile-image-data}))
