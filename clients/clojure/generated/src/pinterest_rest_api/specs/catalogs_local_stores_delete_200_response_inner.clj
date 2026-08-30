(ns pinterest-rest-api.specs.catalogs-local-stores-delete-200-response-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-ad-preview-delete-200-response-inner-status :refer :all]
            )
  (:import (java.io File)))


(def catalogs-local-stores-delete-200-response-inner-data
  {
   (ds/req :id) string?
   (ds/req :status) campaign-ad-preview-delete-200-response-inner-status-spec
   })

(def catalogs-local-stores-delete-200-response-inner-spec
  (ds/spec
    {:name ::catalogs-local-stores-delete-200-response-inner
     :spec catalogs-local-stores-delete-200-response-inner-data}))
