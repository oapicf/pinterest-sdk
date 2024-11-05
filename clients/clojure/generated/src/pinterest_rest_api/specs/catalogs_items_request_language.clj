(ns pinterest-rest-api.specs.catalogs-items-request-language
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-items-request-language-data
  {
   })

(def catalogs-items-request-language-spec
  (ds/spec
    {:name ::catalogs-items-request-language
     :spec catalogs-items-request-language-data}))
