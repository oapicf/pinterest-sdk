(ns pinterest-rest-api.specs.lead-subscription-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-subscription-create-data
  {
   (ds/opt :lead_form_id) string?
   (ds/req :webhook_url) string?
   })

(def lead-subscription-create-spec
  (ds/spec
    {:name ::lead-subscription-create
     :spec lead-subscription-create-data}))
