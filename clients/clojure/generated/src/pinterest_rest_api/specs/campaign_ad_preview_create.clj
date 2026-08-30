(ns pinterest-rest-api.specs.campaign-ad-preview-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-ad-preview-create-data
  {
   (ds/req :ad_group_id) string?
   })

(def campaign-ad-preview-create-spec
  (ds/spec
    {:name ::campaign-ad-preview-create
     :spec campaign-ad-preview-create-data}))
