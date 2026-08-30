//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'asset_type_response.g.dart';

class AssetTypeResponse extends EnumClass {

  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  @BuiltValueEnumConst(wireName: r'AD_ACCOUNT')
  static const AssetTypeResponse AD_ACCOUNT = _$AD_ACCOUNT;
  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  @BuiltValueEnumConst(wireName: r'MERCHANT')
  static const AssetTypeResponse MERCHANT = _$MERCHANT;
  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  @BuiltValueEnumConst(wireName: r'PROFILE')
  static const AssetTypeResponse PROFILE = _$PROFILE;
  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  @BuiltValueEnumConst(wireName: r'ASSET_GROUP')
  static const AssetTypeResponse ASSET_GROUP = _$ASSET_GROUP;
  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  @BuiltValueEnumConst(wireName: r'PINNER_LIST')
  static const AssetTypeResponse PINNER_LIST = _$PINNER_LIST;
  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  @BuiltValueEnumConst(wireName: r'CONVERSION_TAG')
  static const AssetTypeResponse CONVERSION_TAG = _$CONVERSION_TAG;
  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  @BuiltValueEnumConst(wireName: r'CATALOG')
  static const AssetTypeResponse CATALOG = _$CATALOG;
  /// Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  @BuiltValueEnumConst(wireName: r'CONVERSION_SEGMENT')
  static const AssetTypeResponse CONVERSION_SEGMENT = _$CONVERSION_SEGMENT;

  static Serializer<AssetTypeResponse> get serializer => _$assetTypeResponseSerializer;

  const AssetTypeResponse._(String name): super(name);

  static BuiltSet<AssetTypeResponse> get values => _$values;
  static AssetTypeResponse valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AssetTypeResponseMixin = Object with _$AssetTypeResponseMixin;

