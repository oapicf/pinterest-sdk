//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'get_business_asset_type_response.g.dart';

class GetBusinessAssetTypeResponse extends EnumClass {

  /// Type of asset.
  @BuiltValueEnumConst(wireName: r'AD_ACCOUNT')
  static const GetBusinessAssetTypeResponse AD_ACCOUNT = _$AD_ACCOUNT;
  /// Type of asset.
  @BuiltValueEnumConst(wireName: r'PROFILE')
  static const GetBusinessAssetTypeResponse PROFILE = _$PROFILE;
  /// Type of asset.
  @BuiltValueEnumConst(wireName: r'ASSET_GROUP')
  static const GetBusinessAssetTypeResponse ASSET_GROUP = _$ASSET_GROUP;
  /// Type of asset.
  @BuiltValueEnumConst(wireName: r'CONVERSION_TAG')
  static const GetBusinessAssetTypeResponse CONVERSION_TAG = _$CONVERSION_TAG;
  /// Type of asset.
  @BuiltValueEnumConst(wireName: r'CATALOG')
  static const GetBusinessAssetTypeResponse CATALOG = _$CATALOG;

  static Serializer<GetBusinessAssetTypeResponse> get serializer => _$getBusinessAssetTypeResponseSerializer;

  const GetBusinessAssetTypeResponse._(String name): super(name);

  static BuiltSet<GetBusinessAssetTypeResponse> get values => _$values;
  static GetBusinessAssetTypeResponse valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class GetBusinessAssetTypeResponseMixin = Object with _$GetBusinessAssetTypeResponseMixin;

