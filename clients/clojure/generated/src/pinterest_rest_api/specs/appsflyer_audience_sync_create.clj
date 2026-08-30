(ns pinterest-rest-api.specs.appsflyer-audience-sync-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def appsflyer-audience-sync-create-data
  {
   (ds/req :container_id) string?
   (ds/opt :url_adid_sha256) string?
   (ds/opt :url_email_sha256) string?
   })

(def appsflyer-audience-sync-create-spec
  (ds/spec
    {:name ::appsflyer-audience-sync-create
     :spec appsflyer-audience-sync-create-data}))
