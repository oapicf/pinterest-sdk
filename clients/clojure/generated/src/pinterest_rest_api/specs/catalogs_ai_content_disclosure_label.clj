(ns pinterest-rest-api.specs.catalogs-ai-content-disclosure-label
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-ai-content-disclosure-label-data
  {
   })

(def catalogs-ai-content-disclosure-label-spec
  (ds/spec
    {:name ::catalogs-ai-content-disclosure-label
     :spec catalogs-ai-content-disclosure-label-data}))
