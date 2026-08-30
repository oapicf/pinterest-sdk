//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'creation_source.g.dart';

class CreationSource extends EnumClass {

  /// The source of conversion events ingestion
  @BuiltValueEnumConst(wireName: r'ADS_API')
  static const CreationSource ADS_API = _$ADS_API;
  /// The source of conversion events ingestion
  @BuiltValueEnumConst(wireName: r'ADS_MANAGER_REPORTING_PAGE')
  static const CreationSource ADS_MANAGER_REPORTING_PAGE = _$ADS_MANAGER_REPORTING_PAGE;
  /// The source of conversion events ingestion
  @BuiltValueEnumConst(wireName: r'ADS_MANAGER_REPORT_BUILDER')
  static const CreationSource ADS_MANAGER_REPORT_BUILDER = _$ADS_MANAGER_REPORT_BUILDER;

  static Serializer<CreationSource> get serializer => _$creationSourceSerializer;

  const CreationSource._(String name): super(name);

  static BuiltSet<CreationSource> get values => _$values;
  static CreationSource valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CreationSourceMixin = Object with _$CreationSourceMixin;

