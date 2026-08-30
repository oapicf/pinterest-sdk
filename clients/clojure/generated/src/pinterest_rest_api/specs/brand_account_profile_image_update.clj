(ns pinterest-rest-api.specs.brand-account-profile-image-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def brand-account-profile-image-update-data
  {
   (ds/opt :content_type) string?
   (ds/opt :data) string?
   })

(def brand-account-profile-image-update-spec
  (ds/spec
    {:name ::brand-account-profile-image-update
     :spec brand-account-profile-image-update-data}))
