//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_event_ingestion_source.g.dart';

class ConversionEventIngestionSource extends EnumClass {

  /// The source of conversion events ingestion
  @BuiltValueEnumConst(wireName: r'TAG')
  static const ConversionEventIngestionSource TAG = _$TAG;
  /// The source of conversion events ingestion
  @BuiltValueEnumConst(wireName: r'MMP')
  static const ConversionEventIngestionSource MMP = _$MMP;
  /// The source of conversion events ingestion
  @BuiltValueEnumConst(wireName: r'FILE_UPLOAD')
  static const ConversionEventIngestionSource FILE_UPLOAD = _$FILE_UPLOAD;
  /// The source of conversion events ingestion
  @BuiltValueEnumConst(wireName: r'CONVERSIONS_API')
  static const ConversionEventIngestionSource CONVERSIONS_API = _$CONVERSIONS_API;
  /// The source of conversion events ingestion
  @BuiltValueEnumConst(wireName: r'NATIVE')
  static const ConversionEventIngestionSource NATIVE = _$NATIVE;

  static Serializer<ConversionEventIngestionSource> get serializer => _$conversionEventIngestionSourceSerializer;

  const ConversionEventIngestionSource._(String name): super(name);

  static BuiltSet<ConversionEventIngestionSource> get values => _$values;
  static ConversionEventIngestionSource valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ConversionEventIngestionSourceMixin = Object with _$ConversionEventIngestionSourceMixin;

