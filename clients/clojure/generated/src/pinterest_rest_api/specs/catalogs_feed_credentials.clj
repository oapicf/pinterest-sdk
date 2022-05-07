(ns pinterest-rest-api.specs.catalogs-feed-credentials
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-credentials-data
  {
   (ds/req :password) string?
   (ds/req :username) string?
   })

(def catalogs-feed-credentials-spec
  (ds/spec
    {:name ::catalogs-feed-credentials
     :spec catalogs-feed-credentials-data}))
