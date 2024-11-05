(ns pinterest-rest-api.specs.conversion-tag-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-tag-create-data
  {
   (ds/req :name) string?
   (ds/opt :aem_enabled) boolean?
   (ds/opt :md_frequency) float?
   (ds/opt :aem_fnln_enabled) boolean?
   (ds/opt :aem_ph_enabled) boolean?
   (ds/opt :aem_ge_enabled) boolean?
   (ds/opt :aem_db_enabled) boolean?
   (ds/opt :aem_loc_enabled) boolean?
   })

(def conversion-tag-create-spec
  (ds/spec
    {:name ::conversion-tag-create
     :spec conversion-tag-create-data}))
